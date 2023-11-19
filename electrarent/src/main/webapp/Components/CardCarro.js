function CardCarro(cars) {
    const cardContainer = document.getElementById('carCard');
    const card = document.createElement('div');
    card.className = 'cardCarro';

    const carName = document.createElement('h2');
    carName.textContent = cars.nomeModelo;

    const carImage = document.createElement('img');
    carImage.src = cars.imgCarro;
    carImage.alt = cars.nomeModelo + ' Image';

    const kmLabel = document.createElement('div');
    kmLabel.textContent = 'Selecione abaixo:';

    const opcoes = document.createElement('div');
    const kmSelect = document.createElement('select');
    kmSelect.className="select";
    kmSelect.id = 'kmSelect';
    const kmOptions = ['1.000','2.000', '3.000', '4.000', '5.000', 'Mais'];
    opcoes.appendChild(kmSelect);

    kmOptions.forEach(optionText => {
      const option = document.createElement('option');
      option.value = optionText.toLowerCase();
      option.text = optionText;
      kmSelect.appendChild(option);
    });

    const valorTitulo = document.createElement('div');
    valorTitulo.textContent = "DIária a partir de: ";

    const valorDiaria = document.createElement('div');
    valorDiaria.className = "valor"
    valorDiaria.textContent = cars.valorDiaria;

    const alugar = document.createElement("div");
    alugar.className = "alugar";
    alugar.textContent = "Alugar esse";


    // Adiciona elementos ao card
    card.appendChild(carName);
    card.appendChild(carImage);
    card.appendChild(kmLabel);
    card.appendChild(kmSelect);
    card.appendChild(valorTitulo)
    card.appendChild(valorDiaria);
    card.appendChild(alugar);

    // Adiciona o card ao container
    cardContainer.appendChild(card);
}

const cars = [
    {
        nomeModelo: 'Renault Kwid E-Tech',
        imgCarro: 'https://storage.googleapis.com/ire-74774-ope/files%2Fmigration%2Ftb_fotos-40260-721.png',
        valorDiaria: '59,89',
    },
    {
        nomeModelo: 'Chevrolet Bold',
        imgCarro: 'https://orca.com.br/uploads/products/br-bolt-branco-summit-2-min-1.png',
        valorDiaria: '49,42',
    },
]

cars.forEach(CardCarro)