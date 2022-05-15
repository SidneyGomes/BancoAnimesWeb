var myArray = [{
	'name': "Baka no test",
	'id': 12
}, {
	'name': "Maid Dragon",
	'id': 13
}, {
	'name': "Shigenki",
	'id': 14
}]


function tableAnime(data) {
	var list = document.getElementById("list-anime")
	var btn_anime = document.getElementById('btn-anime-inicio')
	
	console.log(Object.keys.length)
	if(Object.keys(data).length > 0){
		
		btn_anime.parentNode.removeChild(btn_anime)
			
		for (var i = 0; i < Object.keys(data).length; i++) {
			list.innerHTML += `<button type='button' id= "btn-anime${i}" onclick= 'clickBtnAnimeList(${Object.values(data)[0].id}, "btn-anime${i}")' class= 'list-group-item list-group-item-action'>` + Object.values(data)[i].name + "</button>"
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
}

