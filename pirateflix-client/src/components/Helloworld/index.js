import React from 'react';

export default connect()(({dispatch}) => (<div>{dispatch({type: 'helloworld/getHelloWorld'})}oi</div>) )
