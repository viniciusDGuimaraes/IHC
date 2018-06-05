function limpar() {
    $("#valorInicial").val("");
    $("#taxaJuros").val("");
    $("#anoInicio").val("");
    $("#anoTermino").val("");
    $("#result").val("");
}

function calcular() {
    let valorInicial = Number($("#valorInicial").val());
    let taxaJuros = Number($("#taxaJuros").val());
    let anoInicio = Number($("#anoInicio").val());
    let anoTermino = Number($("#anoTermino").val());
    let result = $("#result");

    if (isNaN($("#valorInicial").val())) {
        alert("Valor Inicial inválido");
        return;
    }

    if (isNaN($("#taxaJuros").val())) {
        alert("Taxa de Juros inválida");
        return;
    }

    if (isNaN($("#anoInicio").val())) {
        alert("Ano Inicial inválido");
        return;
    }

    if (isNaN($("#anoTermino").val())) {
        alert("Ano de Término inválido");
        return;
    }

    let valorInicialTxt = valorInicial.toFixed(2);

    let text = "\"Nono Programa de Práticas Profissionais\"\r\n"
        + "\r\n"
        + "Valor Inicial:" + accountForSpace("Valor Inicial:", 0) + "Juros ao ano:\r\n"
        + "R$ " + valorInicialTxt + accountForSpace(valorInicialTxt, 3) + (taxaJuros * 100).toFixed(2) + "%\r\n"
        + "\r\n"
        + "A rentabilidade de sua aplicação no final de cada ano será:\r\n"
        + "\r\n";
        + "Ano" + accountForSpace("Ano", 0) + "Valor" + accountForSpace("Valor", 0) + "Juros (%)\r\n";
    
    let valorTmp = valorInicial;

    // Tabela anual
    for (let ano = anoInicio + 1; ano <= anoTermino; ano++) {
        valorTmp = (valorTmp * (1 + taxaJuros)).toFixed(2);
        let jurosTmp = ((valorTmp / valorInicial * 100) - 100).toFixed(2);

        text = text +
            ano + accountForSpace(ano.toString(), 0) + "R$ " + valorTmp +
            accountForSpace(valorTmp.toString(), 0) + jurosTmp + "%\r\n";
    }
    
    result.val(text);
}

function accountForSpace(str, offset) {
    let spaceString = "";
    let colSize = 20;

    for (let i = str.length + offset; i < colSize; i++) {
        spaceString = spaceString + " ";
    }

    return spaceString;
}
