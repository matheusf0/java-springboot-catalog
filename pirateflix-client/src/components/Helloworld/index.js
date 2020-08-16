import React from 'react';
import {connect} from 'dva';
import helloworld from "@/models/helloworld";

export default connect(state=> ({helloworld: state.helloworld.helloworld}))(({helloworld}) => {
  return (<div>{helloworld}</div>);
})
