import query from '@/services/helloworld.ts'

export default{
  namespace: 'helloworld',
  state: {
   helloworld: null
  },

  reducers:{
    setHelloWorld(state,{payload}){
      return {...state, helloworld: payload};
    }
  },

  effects:{
    *getHelloWorld(_,{call,put}){
      const hello = yield call(query);
      yield put({
        type: 'setHelloWorld',
        payload: hello
      });

      console.log('veio aqui')
    }
  },
  subscriptions: {
    setup(prop) {
      const {dispatch, history} = prop;
      return history.listen(({pathname}) => {
        if (pathname === '/welcome/helloworld') {
          dispatch({type: 'getHelloWorld'});
        }
      })
    }
  }
}
