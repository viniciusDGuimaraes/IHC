let anoInicial = 2010;
let anos = 5;
let valorInicial = 1000;
let jurosAnual = 12;

let vezesVisitada = 0;

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

    $("#vez").text(getVezesVisitada());

    $("#continuarOk").click(function () {
        location.reload();
    });
    
    $("#continuarNo").click(function () {
        close();
    });
}

function createCookie(name, value, days) {
    var expires;
    if (days) {
        var date = new Date();
        date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
        expires = "; expires=" + date.toGMTString();
    }
    else {
        expires = "";
    }
    document.cookie = name + "=" + value + expires + "; path=/";
}

function getCookie(c_name) {
    if (document.cookie.length > 0) {
        c_start = document.cookie.indexOf(c_name + "=");
        if (c_start != -1) {
            c_start = c_start + c_name.length + 1;
            c_end = document.cookie.indexOf(";", c_start);
            if (c_end == -1) {
                c_end = document.cookie.length;
            }
            return unescape(document.cookie.substring(c_start, c_end));
        }
    }
    return "";
}

function getVezesVisitada() {
    var vezes = localStorage.getItem("vezes");

    if (vezes !== "" && typeof vezes !== "undefined") {
        localStorage.setItem("vezes", Number(vezes) + 1);
        return Number(vezes);
    } else {
        localStorage.setItem("vezes", 1);
        return 0;
    }
}
