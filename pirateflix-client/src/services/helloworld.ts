import { request } from 'umi';

export default async function query() {
  return request<string>('/api');
}
