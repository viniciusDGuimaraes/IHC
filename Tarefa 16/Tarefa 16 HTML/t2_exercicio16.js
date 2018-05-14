function findResult() {
    let valor = Number($("#valor").val());
    let tipo = $('input[name=tipo]:checked').val();
    let perc = Number($('input[name=perc]:checked').val());

    let diff = Number(valor * perc / 100);

    if(tipo === "desconto") {
        $("#result").val(valor - diff);
    } else {
        $("#result").val(valor + diff);
    }
}

$(document).ready(function () {
    $("input").change(function () {
        findResult();
    });
});
