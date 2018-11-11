 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	    <title>JAVA</title>
	    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	    <link rel="stylesheet" href="css/Gather.css" type="text/css" media="all">
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
	<div class="container w3layouts agileits">
		<div class="login w3layouts agileits">
			<h2>数据读取</h2>
			<form action="CollectDataServlet" method="post">
	
				<input type="text" Name="UserName"   placeholder="品牌名"      required=""/><br><br>
				<input type="text" Name="UserURL"    placeholder="品牌URL"     required=""/><br><br>
				<input type="text" Name="UserNumber" placeholder="执行次数"     required=""/><br><br>
				<div>是否加入购物车</div>
				<label><input checked="true"   name="AddCart" type="radio" value="是" />是</label>
                <label><input name="AddCart" type="radio" value="否" />否</label><br><br> 
                <div>是否加入心愿车</div>
				<label><input checked="true"  name="WishCart" type="radio" value="是" />是</label> 
                <label><input name="WishCart" type="radio" value="否" />否</label><br><br>    		
				<div class="send-button w3layouts agileits">			
					<input type="submit" value=" 提   交 "  style="width: 350px; height: 40px" >				
			    </div> 
			</form>
              <div class="clear"></div>
              
                <div class="send-button w3layouts agileits">			
					<input type="submit" value="多 条 执 行   &   手 动 录 入 "  style="width: 350px; height: 40px" onclick="window.location.href='HighConcurrency.jsp'"></input>					
			    </div> 
			    
			     <div class="send-button w3layouts agileits">			
					<input type="submit" value=" 多 条 执 行   &   自 动 录 入  "  style="width: 350px; height: 40px" onclick="window.location.href='AutomaticDataCollection.jsp'"></input>					
			    </div> 
              
			</div>	
			  <div class="clear"></div>		
		</div>
		    
</body>
</html>