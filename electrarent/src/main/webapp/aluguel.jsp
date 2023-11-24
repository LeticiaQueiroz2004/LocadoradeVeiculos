<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>ElectraRent</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" type="text/css" href="/css/aluguel.css">
    <link rel="icon" type="shorticon" href="https://img.freepik.com/vetores-premium/compre-o-compartilhamento-de-compra-ou-o-logotipo-do-carro-alugado-com-o-negociante-de-carros-de-icones-planos-da-as-chaves-ao-comprador-ilustracao-vetorial-isolada_108855-3539.jpg?w=360"/>
    <link rel="stylesheet" href="/css/StyleComponentes.css">
</head>
<body>

<div class="container">
    <div class="header">
        <div id="header-container"></div>
        <script src="/componentes/Cabecalho.js"></script>
    </div>
    <div class="container">
        <div class="aluguelContainer">
            <div class="detalhesCotacao">
                <div class="ContainerInfo">
                    <div class="infoTitulo"> DETALHES DO PRODUTO </div>
                    <div> <b> Retirada </b> </div>
                    <div class="ContainerInfo">
                        <div class="containerRow">
                            <div> <img src="https://static.vecteezy.com/ti/vetor-gratis/t2/5082641-icone-de-linha-de-espaco-reservado-vetor.jpg" width="20"/> </div>
                            <div class="local"> São Paulo, SP </div>
                        </div>
                        <div class="containerRow">
                            <div> <img src="https://static.vecteezy.com/ti/vetor-gratis/p3/19618691-icone-de-de-calendario-vetor.jpg" width="20"/> </div>
                            <input class="input-form" type="date" name="retirada" id="retirada">
                        </div>
                    </div>
                    <div> <b> Devolução </b> </div>
                    <div class="ContainerInfo">
                        <div class="containerRow">
                            <div> <img src="https://static.vecteezy.com/ti/vetor-gratis/t2/5082641-icone-de-linha-de-espaco-reservado-vetor.jpg" width="20"/> </div>
                            <div class="local"> São Paulo, SP </div>
                        </div>
                        <div class="containerRow">
                            <div> <img src="https://static.vecteezy.com/ti/vetor-gratis/p3/19618691-icone-de-de-calendario-vetor.jpg" width="20"/> </div>
                            <input class="input-form" type="date" name="devolucao" id="devolucao">
                        </div>
                    </div>
                </div>

                <div class="ContainerInfo info2">
                    <div class="infoTitulo"> SEU VEÍCULO </div>
                    <div> <b> Renault Kwid E-teck </b> </div>
                    <div> <img src="https://fotos-jornaldocarro-estadao.nyc3.cdn.digitaloceanspaces.com/wp-content/uploads/2022/04/14110610/Kwid-1160x653.png" width="400"/> </div>
                </div>

                <div class="ContainerInfo info2">
                    <div class="infoTitulo"> SUA COTAÇÃO </div>
                    <div class="cotacaoitem"> <b> Valor diária: </b> <label class="negrito"> 59,89 </label> </div>
                    <div class="cotacaoitem"> <b> Quantidade dias: </b> 30 dias (Plano Mensal) </div>
                    <div class="cotacaoitem"> <b> Taxa de serviço: </b> 10,00 </div>
                </div>

                <div class="ContainerInfo info2">
                    <div class="infoTitulo"> VALOR TOTAL DO ALUGUEL </div> <label class="negrito"> 59,89 </label>
                </div>
            </div>

            <div class="detalhesCompra">
                <div class="infoTitulo"> DETALHES DO CONDUTOR </div>
                <form action="/Aluguel" method="post">
                    <div class="wrap-input">
                        <input class="input-form" type="text" name="nome" id="nome">
                        <span class="focus-input-form" data-placeholder="Nome Completo"></span>
                    </div>

                    <div class="container-row">
                        <div class="wrap-input">
                            <input class="input-form" type="email" name="email" id="email">
                            <span class="focus-input-form" data-placeholder="E-mail"></span>
                        </div>
                        <div class="wrap-input">
                            <input class="input-form" type="text" name="nacionalidade" id="nacionalidade">
                            <span class="focus-input-form" data-placeholder="Nacionalidade"></span>
                        </div>
                    </div>

                    <div class="container-row">
                        <div class="wrap-input">
                            <input class="input-form" type="date" name="nascimento" id="nascimento">
                            <span class="focus-input-form" data-placeholder=""></span>
                        </div>
                        <div class="wrap-input">
                            <input class="input-form" type="text" name="rg" id="rg">
                            <span class="focus-input-form" data-placeholder="RG"></span>
                        </div>
                        <div class="wrap-input">
                            <input class="input-form" type="text" name="cpf" id="cpf">
                            <span class="focus-input-form" data-placeholder="CPF"></span>
                        </div>
                        <div class="wrap-input">
                            <input class="input-form" type="telephone" name="telefone" id="telefone">
                            <span class="focus-input-form" data-placeholder="telefone"></span>
                        </div>
                    </div>
                    <div class="infoTitulo"> Informações de endereçamento </div>
                    <div class="wrap-input">
                        <input class="input-form" type="text" name="endereco" id="endereco">
                        <span class="focus-input-form" data-placeholder="Endereço"></span>
                    </div>
                    <div class="container-row">
                        <div class="wrap-input">
                            <input class="input-form" type="text" name="cep" id="cep">
                            <span class="focus-input-form" data-placeholder="CEP"></span>
                        </div>
                        <div class="wrap-input">
                            <input class="input-form" type="text" name="bairro" id="bairro">
                            <span class="focus-input-form" data-placeholder="Bairro"></span>
                        </div>
                        <div class="wrap-input">
                            <input class="input-form" type="email" name="cidade" id="cidade">
                            <span class="focus-input-form" data-placeholder="Cidade"></span>
                        </div>
                        <div class="wrap-input">
                            <input class="input-form" type="text" name="complemento" id="complemento">
                            <span class="focus-input-form" data-placeholder="Complemento/Nº da casa"></span>
                        </div>
                    </div>
                    <form class="formaPagto">
                        <div class="infoTitulo"> Formas de pagamento </div>
                        <label> <input type="checkbox" name="formaPagamento" value="pix"> Pix </label>
                        <label> <input type="checkbox" name="formaPagamento" value="cartaoCredito"> Cartão de Crédito  </label>
                        <label> <input type="checkbox" name="formaPagamento" value="pagarNaRetirada"> Pagar na Retirada </label>
                    </form>

                    <div class="container-botao">
                        <div class="cancelar">
                            <button> Cancelar </button>
                        </div>
                        <div class="finalizar">
                            <button type="submit"> Finalizar </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div id="rodape-container"></div>
    <script src="/componentes/Rodape.js"></script>
</body>
</html>