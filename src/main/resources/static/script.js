function getAnimes() {
	var url = "/anime/allanime"

	$.get(url, function(responseJson) {
		tableAnime(responseJson)

		if (Object.keys(responseJson).length > 0) {
			clickBtnAnimeList(Object.values(responseJson)[0].id, `btn-anime${0}`)
		}

	}).done(function() {
		//console.log("sucess")
	}).fail(function() {
		alert("fail")

	});

}

function tableAnime(data) {

	var list = document.getElementById("list-anime")
	var btn_anime = document.getElementById('btn-anime-inicio')

	if (Object.keys(data).length > 0) {

		if (btn_anime != null) {
			btn_anime.parentNode.removeChild(btn_anime)

		}

		list.innerHTML = "";

		for (var i = 0; i < Object.keys(data).length; i++) {
			list.innerHTML += `<button type='button' id= "btn-anime${i}" onclick= 'clickBtnAnimeList(${Object.values(data)[i].id}, "btn-anime${i}")' class= 'list-group-item list-group-item-action'>` + Object.values(data)[i].name + "</button>"
		}

		btn_anime = document.getElementById('btn-anime0')
		$(btn_anime).addClass('active')

	}
}

$(document).ready(function() {
	var url = "anime/save_anime"

	$("#bookForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		ajaxPost();
		alert("Anime cadastrado com sucesso !");
	});

	function ajaxPost() {

		// PREPARE FORM DATA
		var formData = {
			name: $("#nameForm").val(),
			link: $("#linkForm").val(),
			weekDay: $("#weekDayForm").val(),
			tam: $("#tamForm").val()
		}

		// DO POST
		$.ajax({
			type: "POST",
			contentType: "application/json",
			url: url,
			data: JSON.stringify(formData),
			dataType: 'json'

		});

		getAnimes();

	}

})


function clickBtnAnimeList(value, idButton) {

	var list = document.getElementById("list-anime")
	var button_anime

	for (var i = 0; i < list.children.length; i++) {
		button_anime = document.getElementById(list.children[i].getAttribute("id"))
		$(button_anime).removeClass("active")
	}

	button_anime = document.getElementById(idButton)
	$(button_anime).addClass("active")


	var url = `/anime/${value}`
	$.get(url, function(responseJson) {

		var list = document.getElementById('table-episodios')
		list.innerHTML = ""
		for (var i = 1; i <= Object.values(responseJson)[6].length; i++) {
			row = ` <tr>
						<th scope = 'row'> ${i}</th> 
						<td> ${Object.values(responseJson)[6][i - 1].name} </td>
						<td class="checkboxalign"><input type="checkbox" name="brand"></td>
						<td></td>													
					<tr/>`

			list.innerHTML += row

		}

		var items = document.getElementsByName('brand');
		for (var i = 0; i < items.length; i++) {
			if (items[i].type == 'checkbox')
				items[i].checked = Object.values(responseJson)[6][i].watched;
		}


	}).done(function() {
		//console.log("sucess")
	}).fail(function() {
		alert("fail")
	});

}


