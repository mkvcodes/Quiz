<#import "/spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Geography Quiz</title>
        <link href="/css/main.css" rel="stylesheet">
    </head>
    <body>
        <h2>Geography Quiz</h2>
		
        <@spring.bind "answer"/>
        <#if answer?? && noErrors??>
            
            	<p>Your Score is  ${score} out of 4!!!! </p>
            	
            
        <#else>
            <form action="/questions" method="post">
                <#if questions ??>
                 <#list questions as quest>
  					<p>${quest}</p>
  						<div>   
  			  Answer: <@spring.formInput "answer.ans"/>
  			  			 <@spring.showErrors "<br>"/> </div>
  			
				</#list>
				</#if>
				<br><br>
				 <input type="submit" value="Submit">
				 <input type="reset" value="Reset">
            </form>
        </#if>

        <script src="/js/main.js"></script>
    </body>
</html>