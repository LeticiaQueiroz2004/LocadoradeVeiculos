// rodape.js
function criarRodape() {
    const rodapeContainer = document.getElementById("rodape-container");

    const rodape = document.createElement("div");
    rodape.className = "rodape";

    const logoRodape = document.createElement("div");
    logoRodape.className = "logo-rodape";
    logoRodape.textContent = "ElectraRent";

    rodape.appendChild(logoRodape);

    const categorias = [
        { nome: "Modelo", funcionalidades: ["Chevrolet Bold", "iCar", "Fiat 500e", "BYD Han", "Outros modelos"] },
        { nome: "Empresa", funcionalidades: ["Sobre nós", "FAQ", "Trabalhe Conosco", "Vantagens dos carros Elétricos"] },
        { nome: "Fale Conosco", funcionalidades: ["WhatsApp", "E-mail", "Facebook", "Instagram", "LinkedIn"] }
    ];

    categorias.forEach((categoria) => {
        const categoriaElement = document.createElement("div");
        categoriaElement.className = "categoria";

        const categoriaTitulo = document.createElement("h3");
        categoriaTitulo.className = "categoriaTitulo"
        categoriaTitulo.textContent = categoria.nome;

        const listaFuncionalidades = document.createElement("ul");
        listaFuncionalidades.className = "lista-funcionalidades";

        categoria.funcionalidades.forEach((funcionalidade) => {
            const funcionalidadeItem = document.createElement("li");
            funcionalidadeItem.className = "funcionalidadeItem";
            funcionalidadeItem.textContent = funcionalidade;
            listaFuncionalidades.appendChild(funcionalidadeItem);
        });

        categoriaElement.appendChild(categoriaTitulo);
        categoriaElement.appendChild(listaFuncionalidades);
        rodape.appendChild(categoriaElement);
    });

    rodapeContainer.appendChild(rodape);
}

criarRodape();
