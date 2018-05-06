$(document).ready(function () {
    atualizar();
});

function atualizar() {
    let result = $("#estado").val() + " - " + $("#estado option:selected").text().trim();

    $("#resultado").val(result);
}
