var myAnimeArray = []

function getAnimes(){
	var url = "/anime/allanime"
	
	$.get(url, function(responseJson){
		tableAnime(responseJson)
		
	}).done(function(){
		//console.log("sucess")
	}).fail(function() {
		alert("fail")
		
	});
	
}

function tableAnime(data) {
	
	var list = document.getElementById("list-anime")
	var btn_anime = document.getElementById('btn-anime-inicio')

	if(Object.keys(data).length > 0){
		
		btn_anime.parentNode.removeChild(btn_anime)
		
		for (var i = 0; i < Object.keys(data).length; i++) {
			list.innerHTML += `<button type='button' id= "btn-anime${i}" onclick= 'clickBtnAnimeList(${Object.values(data)[i].id}, "btn-anime${i}")' class= 'list-group-item list-group-item-action'>` + Object.values(data)[i].name + "</button>"
		}
		
		btn_anime = document.getElementById('btn-anime0')
		$(btn_anime).addClass('active')

	}
}

function clickBtnAnimeList(value, idButton) {
	
	var list = document.getElementById("list-anime")
	var button_anime
	
	for(var i = 0; i < list.children.length; i++){
		button_anime = document.getElementById(list.children[i].getAttribute("id"))
		$(button_anime).removeClass("active")
	}
	
	button_anime = document.getElementById(idButton)
	$(button_anime).addClass("active")
	
	
	var url = `/anime/${value}`
	$.get(url, function(responseJson){
		
		var list = document.getElementById('table-episodios')
		list.innerHTML = ""
		for(var i = 1; i <= Object.values(responseJson)[5].length; i++){
			row = ` <tr>
						<th scope = 'row'> ${i}</th> 
						<td> ${Object.values(responseJson)[5][i-1].name} </td>
						<td><input type="checkbox" name="brand"></td>
						<td> </td>													
					<tr/>`
			
			list.innerHTML += row
		
                 
		}
		
		var items = document.getElementsByName('brand');
		for (var i = 0; i < items.length; i++) {
              if (items[i].type == 'checkbox')
                  items[i].checked = Object.values(responseJson)[5][i].watched;
          }
		
		
	}).done(function(){
		//console.log("sucess")
	}).fail(function() {
		alert("fail")
		
	});
	
}


