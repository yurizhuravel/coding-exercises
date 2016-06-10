function getRandomColor() {
    		var letters = '0123456789ABCDEF'.split('');
    		var color = '#';
    		for (var i = 0; i < 6; i++ ) {
        		color += letters[Math.floor(Math.random() * 16)];
    		}
    		return color;
		}
		

		var clickedTime; var createdTime; var reactionTime;
		
		function makeBox() {
			
			var time=Math.random();
		
			time=time*5001;	
		
				setTimeout(function() {
				
					if (Math.random()>0.5) {
					
						document.getElementById("box").style.borderRadius="50px";
					
					} else {
					
						document.getElementById("box").style.borderRadius="0px"
					
					}
					
					var margTop=Math.random();
					
					margTop=margTop*200;
					
					margTop=Math.floor(margTop);
		
					var margLeft=Math.random();
					
					margLeft=margLeft*200;
					
					margLeft=Math.floor(margLeft);
					
					
					document.getElementById("box").style.marginTop=margTop+"px";
					
					document.getElementById("box").style.marginLeft=margLeft+"px";
					
					document.getElementById("box").style.backgroundColor=getRandomColor();
					
					document.getElementById("box").style.display="block";
					
					createdTime=Date.now();
		
				}, time);
		}
		
		makeBox();
		
		document.getElementById("box").onclick=function () {
		
				clickedTime=Date.now();
				
				this.style.display="none";
				
				reactionTime=(clickedTime-createdTime)/1000;
				
				document.getElementById("timeSpan").innerHTML=reactionTime+" seconds";
		
				makeBox();
		
		}