import React from 'react';
import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-layout';

export default () => (
  <DefaultFooter
    copyright="2020"
    links={[
      {
        key: 'github',
        title: <GithubOutlined />,
        href: 'https://github.com/matheusf0/java-springboot-catalog',
        blankTarget: true,
      },
    ]}
  />
);
