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
      const hello = yield call(query)
      console.log(hello)
    }
  }
}
