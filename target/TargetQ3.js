const dados = require('./dados.json');

var total = 0, menor = 0, maior = 0, media = 0, contMed = 0;

for(var i = 0; i < 30; i++){

    total += dados.faturamento[i].valor;
}

media = total / 30;

for(var j = 0; j < 30; j++){

    if(dados.faturamento[j].valor > maior){
        maior = dados.faturamento[j].valor;
    }

    if(j == 0){
        menor = dados.faturamento[j].valor;
    }else if(dados.faturamento[j].valor < menor && dados.faturamento[j].valor != 0){
        menor = dados.faturamento[j].valor;
    }
    
    if(dados.faturamento[j].valor > media){
        contMed++;
    }
}

console.log("O menor valor no mes foi " + menor.toFixed(2) + ".");
console.log("O maior valor do mes foi " + maior.toFixed(2) + ".");
console.log("O numero de valores maiores do que a media e " + contMed + ".");