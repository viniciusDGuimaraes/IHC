let anoInicial = 2010;
let anos = 5;
let valorInicial = 1000;
let jurosAnual = 12;

setup();
preencherTabela();

function preencherTabela() {
    let result = calcularJuros(valorInicial, jurosAnual, anos);

    for (let i = 0; i < result.length; i++) {
        let valor = result[i].valor;
        let juros = result[i].juros;

        let row = "\
            <tr>\
                <td>" + (anoInicial + 1 + i) + "</td>\
                <td>R$ " + valor + "</td>\
                <td>" + juros + "%</td>\
            </tr>";
        
        $("#tabelaRentabilidade > tbody").append(row);
    }
}

function calcularJuros(valor, juros, iteracoes) {
    let result = [];

    let tmpValor = valor;

    for (let i = 0; i < iteracoes; i++) {
        newValor = tmpValor * ((juros / 100) + 1);
        jurosAno = (newValor - valor) / valor * 100;

        tmpValor = newValor;

        result.push({
            valor: tmpValor.toFixed(2).toString().replace(".", ","),
            juros: jurosAno.toFixed(2).toString().replace(".", ",")
        });
    }

    return result;
}

function setup() {
    $("#valorInicial").text("R$ " + valorInicial.toFixed(2).toString().replace(".", ","));
    $("#jurosAnual").text(jurosAnual.toFixed(2).toString().replace(".", ",") + "%");
}
