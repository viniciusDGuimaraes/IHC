function updateLabel() {
	var estado = $("#select-estado").val();
	$("#resultado").html(estado);
}

$(document).ready(function () {
	$("#select-estado").on("change", function (e) {
        updateLabel();
    });
	
	updateLabel();
});
