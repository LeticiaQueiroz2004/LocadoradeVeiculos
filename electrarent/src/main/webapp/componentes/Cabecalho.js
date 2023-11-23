
// Função para criar o componente do cabeçalho e poder utilizá-lo em todas as telas
function CriarCabecalho() {
    const headerContainer = document.getElementById("header-container");

    const header = document.createElement("div");
    header.id = "cabecalho";

    const logo = document.createElement("a");
    logo.id = "logo";
    logo.textContent = "ElectraRent";
    logo.href="/index.jsp";

    const menu = document.createElement("ul");
    menu.id = "menu";

    const menuItemS = [
        { text: "Aluguel de Carros", targetPage: "/explorar.jsp" },
        { text: "Planos", targetPage: "/planos.jsp"},
        { text: "Sobre", targetPage: "./sobre.jsp" },
        { text: "FAQ", targetPage: "/faq.jsp" }
    ];

    menuItemS.forEach((item) => {
        const menuItem = document.createElement("li");
        const link = document.createElement("a");
        link.textContent = item.text;
        link.href = item.targetPage;
        menuItem.appendChild(link);
        menu.appendChild(menuItem);
    });

    const buttons = document.createElement("div");
    buttons.id = "botoes";

    const button1 = document.createElement("a");
    button1.className = "botao1";
    button1.textContent = "Login";
    button1.href ="/login.jsp";

    const button2 = document.createElement("a");
    button2.className = "botao2";
    button2.textContent = "Cadastro";
    button2.href="/cadastro.jsp";

    buttons.appendChild(button1);
    buttons.appendChild(button2);

    header.appendChild(logo);
    header.appendChild(menu);
    header.appendChild(buttons);

    headerContainer.appendChild(header);

    const menuLinks = menu.querySelector("a");
    menuLinks.forEach((link) => {
        link.addEventListener("click", function (event) {
            event.preventDefault();
            const targetPage = this.getAttribute("href");
            contentContainer.innerHTML = `Você está na página: ${targetPage}`;
        });
    });
}

CriarCabecalho();
