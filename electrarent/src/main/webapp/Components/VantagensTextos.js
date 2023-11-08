// container.js
function VantagensTextos(imagemUrl, titulo, descricao) {
    const containerElement = document.getElementById("container-esquerda");

    const container = document.createElement("div");
    container.className = "container-3";

    const textoContainer = document.createElement("div");
    textoContainer.className = "container-texto";

    const tituloVantagem = document.createElement("h2");
    tituloVantagem.className = ".tituloVantagem";
    tituloVantagem.textContent = titulo;

    const descricaoVantagem = document.createElement("p");
    descricaoVantagem.className = "descricao";
    descricaoVantagem.textContent = descricao;

    const imagem = document.createElement("img");
    imagem.src = imagemUrl;

    textoContainer.appendChild(tituloVantagem);
    textoContainer.appendChild(descricaoVantagem);

    container.appendChild(imagem);
    container.appendChild(textoContainer);

    containerElement.appendChild(container);
}

const imagem = [
            "https://img.freepik.com/vetores-premium/ilustracao-em-vetor-conceito-abstrato-de-emissoes-de-gases-de-efeito-estufa_107173-20534.jpg?w=2000", 
            "https://img.freepik.com/vector-premium/diseno-ecologico_24877-4538.jpg", 
            "https://static.vecteezy.com/ti/vetor-gratis/p3/17225670-centro-de-servico-de-carro-eletrico-ev-com-inspecao-de-inspetor-de-cliente-engenheiro-de-automoveis-e-manutencao-tecnica-de-motor-e-icone-de-isometrico-de-reparo-isolado-vetor.jpg"];

const tituloVantagem = ["Sem emissões", 
                        "Eficiência energética", 
                        "Manutenção"]

const descricao =  ["Não emitir poluentes no meio ambiente é uma das maiores contribuições do veículo elétrico. Em comparação ao motor a combustão, o de propulsão elétrica reduz em, aproximadamente, 30% a geração de CO₂", 
                    "O veículo elétrico é altamente eficiente quando colocado em movimento. Segundo Sugahara, ele consome, aproximadamente, 90% da eficiência energética disponível, ao contrário dos modelos dotados de motor a combustão, que aproveitam apenas de <strong>30%</strong> a <strong>40%</strong>", 
                    "Em um carro com propulsão 100% elétrica, os custos de manutenção são inferiores, pois não é necessário substituir, por exemplo, filtros de óleo e ar, velas de ignição e correia dentada. O desgaste das peças também é bem menor."]

                
for (let i = 0; i < imagem.length; i++) {
    VantagensTextos(imagem[i], tituloVantagem[i], descricao[i]);
}