	//显示
	function displayTable(){
		var divTable1=document.getElementById("divTable1"); 
		if(divTable1.style.display=='none'){
			divTable1.style.display='block';
		}
		/*
		//jquary显示
		if($("#divTable1").attr("hidden")){
			$("#divTable1").removeAttr("hidden");
		}
		//dom显示
		if(divTable1.hidden){
			divTable1.removeAttribute("hidden");
			}
		*/
	}
	//隐藏
	function copyText(){
		console.info(1);
		var divTable1=document.getElementById("divTable1"); 
		
		if(divTable1.style.display=='block'){
			divTable1.style.display='none';
		}
		/*
		if(!$("#divTable1").attr("hidden")){
			$("#divTable1").attr("hidden","");
		}
		
		if(!divTable1.hidden){
			divTable1.setAttribute("hidden","");
			divTable1.removeAttribute("style");
		}
		*/
	}
	
	//数据处理
	function test_Map_Json(){
		 $.ajax({
			    type: 'GET',
			    url: 'test/test_Map_Json',
			    success: function (data) {
			    	console.info("********************************************************");
			    	console.info("data :"+ data);
			    	console.info("data type :"+ typeof data);
			    	console.info("data[\"name\"]:"+ data["name"]);
			    	console.info("data.name:"+ data.name);
			    	var stringify=JSON.stringify(data);
			    	console.info("JSON.stringify(json) :"+ stringify);
			    	console.info("JSON.stringify(json) type :"+ typeof stringify);
			    	var parse=JSON.parse(stringify)
			    	console.info("JSON.parse(stringify) :"+ parse);
			    	console.info("JSON.parse(stringify) type :"+ typeof parse);
			    	console.info("parse[\"name\"]:"+ parse["name"]);
			    	console.info("parse.name:"+ parse.name);
			    	
			    },
			    error: function (data) {
			      alert("系统异常"+data);
			    }
			});
		  }

	function test_Json_Json(){
		 $.ajax({
			    type: 'GET',
			    url: 'test/test_Json_Json',
			    success: function (data) {
			    	console.info("********************************************************");
			    	console.info("data :"+ data);
			    	console.info("data type :"+ typeof data);
			    	var parse=JSON.parse(data)
			    	console.info("data[\"name\"] parse :"+ parse["name"]);
			    	var jsonobj= eval('(' + data + ')');
			    	console.info("data[\"name\"] jsonobj :"+ jsonobj["name"]);
			    },
			    error: function (data) {
			      alert("系统异常"+data);
			    }
			});
		  }
	function test_List(){
		 $.ajax({
			    type: 'POST',
			    url: 'test/test_List',
			    success: function (data) {
			    	for(var i=0;i<data.length;i++){
			    		console.info(data[i].userId);
			    	}
			    },
			    error: function (data) {
			      alert("系统异常"+data);
			    }
			});
		  }
	