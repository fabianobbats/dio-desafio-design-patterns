<h1>DIO - Desafio de Projeto</h1>

<h2>Desafio: Explorando Padrões de Projetos na Prática com Java</h2>

<p>Nesse desafio eu utilizei o padrão <strong>Observer</strong> que também é conhecido como <strong>Publish-Subscribe</strong>.</p>

<p>O padrão Publish-Subscribe é um modelo de comunicação entre componentes que permite a um emissor (publisher) enviar mensagens para um ou mais receptores (subscribers) sem conhecer sua identidade ou localização. Os publishers e os subscribers se comunicam através de um intermediário (broker) que gerencia os tópicos de interesse e distribui as mensagens de acordo com as assinaturas dos subscribers. Esse padrão facilita o desacoplamento, a escalabilidade e a tolerância a falhas dos sistemas distribuídos.</p>

<p>Nesse projeto foi modelado as classes ArCondicionado e Aquecedor (que funcionam com subscribers) e a classe Sensor(que é funciona como publisher). Onde dado uma certa temperatura pelo sensor, o ArCondicionado e Aquecedor ficam 'ouvindo' e ligam ou desligam conforme os parametros.<p>
