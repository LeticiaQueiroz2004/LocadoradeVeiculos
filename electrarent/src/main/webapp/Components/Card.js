// card.js
function CriarCard(imagemUrl, titleText) {
    const cardList = document.getElementById("card-list");

    const card = document.createElement("div");
    card.className = "card";

    const imagem = document.createElement("img");
    imagem.src = imagemUrl;

    const title = document.createElement("div");
    title.className = "card-title";
    title.textContent = titleText;

    card.appendChild(imagem);
    card.appendChild(title);

    cardList.appendChild(card);
}

// Exemplo de uso:
const imagemUrl = [
                    "https://images.summitmedia-digital.com/topgear/images/2023/04/26/byd-han-ev-2023-main-1682505103.jpg", 
                    "https://www.redecarveiculos.com.br/wp-content/uploads/2022/10/icar-branco.png", 
                    "https://www.seekpng.com/png/detail/962-9625681_lamborghini-gallardo-lp-monochrome-chevrolet-bolt-1.png", 
                    "https://automegarenault.com.br/assets/uploads/nt_veiculos_cores/81401-Cores-Branco-polar.png?v=2", 
                    "https://www.nissan-cdn.net/content/dam/Nissan/br/site/veiculos/leaf-my23/thumbnails/leaf-2023-730px.png"];

const modelos = ["BYD Han", 
                "iCar", 
                "Chevrolet Bold", 
                "Renault Kwid E-Tech", 
                "Nissan Leaf"];

for (let i = 0; i < imagemUrl.length; i++) {
    CriarCard(imagemUrl[i], modelos[i]);
}


