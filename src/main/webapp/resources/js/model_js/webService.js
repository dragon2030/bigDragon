/**
 * webService传输
 * @returns
 */

/**
 * RESTFUL POST请求http
 */
function post_json(){
		var param={"name":"mike","age":"22"};//后台需要JSON解析
		var json=JSON.stringify(param);//json对象转换为json字符串//后台需要JSON解析
		var test="1234";
		var str="user=Mike&age=22";
		 $.ajax({
			    type: 'POST',
			    //url: 'test/testJson'+"?"+str,  //可以通过此方式取具体参数@RequestParam String user,@RequestParam String age
			    url: 'test/testJson',
			    data: str,
			    //contentType: 'application/json;charset=utf-8',
			    success: function (data) {

			    	console.info(data);
			    },
			    error: function (data) {
			      alert("系统异常"+data);
			    }
			});
	}
	
	function test_form(){
		var param={"name":"mike","age":"22"};
		var json=JSON.stringify(param);
		var test="1234";
		var str="user=Mike&age=22";
		 $.ajax({
			    type: 'POST',
			    url: 'test/testForm',//+"?"+str,
			    data: "user="+test,
			    contentType: 'application/x-www-form-urlencoded',//为默认传输方法
			    success: function (data) {

			    	console.info(data);
			    },
			    error: function (data) {
			      alert("系统异常"+data);
			    }
			});
	}

function test_request_response(){
	 $.ajax({
		    type: 'GET',
		    url: 'test/testRequestResponse',
		    success: function (data) {
		    	console.info("********************************************************");
		    	console.info("data :"+ data);
		    },
		    error: function (data) {
		      alert("系统异常"+data);
		    }
		});
}