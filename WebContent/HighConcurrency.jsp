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
			<form action="HighConcurrencyServlet" method="post">
	
				
				<input type="text" Name="UserURL"    placeholder="品 牌   URL"     required=""/><br><br>
				<input type="text" Name="UserName1"   placeholder="品 牌 名  ONE"      required=""/><br><br>
				<input type="text" Name="UserName2"   placeholder="品 牌 名  TWO"      required=""/><br><br>
				<input type="text" Name="UserName3"   placeholder="品 牌 名  THREE"     required=""/><br><br>
				<input type="text" Name="UserName4"   placeholder="品 牌 名  FOUR"      required=""/><br><br>
				<input type="text" Name="UserName5"   placeholder="品 牌 名  FIVE"      required=""/><br><br>
				<input type="text" Name="UserName6"   placeholder="品 牌 名  SIX"      required=""/><br><br>
				
				<div> 是 否 加 入 购 物 车 </div>
				<label><input checked="true"   name="AddCart" type="radio" value="是" />是</label>			
                <label><input name="AddCart" type="radio" value="否" />否</label><br><br> 
                <div> 是 否 加 入 心 愿 车</div>
				<label><input checked="true"  name="WishCart" type="radio" value="是" />是</label> 
                <label><input name="WishCart" type="radio" value="否" />否</label><br><br>    		
				<div class="send-button w3layouts agileits">			
					<input type="submit" style="width: 350px; height: 40px"  value="提交">				
			    </div> 
			</form>
              
              
			</div>	
			  <div class="clear"></div>		
		</div>
		    
</body>
</html>