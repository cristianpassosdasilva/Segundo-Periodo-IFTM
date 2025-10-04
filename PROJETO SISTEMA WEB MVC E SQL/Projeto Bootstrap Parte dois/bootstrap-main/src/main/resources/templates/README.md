# Projeto Bootstrap - Wild & Wacky Vegetables

Este projeto demonstra a implementação de um layout responsivo utilizando Bootstrap 5.3.3 em uma aplicação Spring Boot.

## 📋 Exercícios Implementados

### 2. Layout com Grid System e Text Classes
**Objetivo:** Usar as classes Grid System e Text do Bootstrap para criar o layout abaixo.

**Classes utilizadas:**
- `container` - Container responsivo
- `row` - Linha do grid system
- `col-md-6` - Colunas que ocupam 50% da largura em telas médias e grandes
- `text-primary` - Cor azul nos links
- `form-control` - Estilização do campo de input
- `btn btn-primary` - Botão estilizado

**Evidência:**
![Layout com Grid System](image.png)

### 3. Header Responsivo Básico (Navbar)
**Objetivo:** Criar uma navbar com marca e links visível em 'lg+' e dentro do colapso em 'lg-'.

**Classes utilizadas:**
- `navbar` - Componente de navegação principal
- `navbar-expand-lg` - Menu expande apenas em telas grandes (≥992px)
- `navbar-dark bg-dark` - Tema escuro com fundo preto
- `navbar-toggler` - Botão hambúrguer para telas pequenas
- `collapse navbar-collapse` - Sistema de colapso responsivo
- `me-auto` - Margem automática para alinhamento à esquerda

**Explicação das escolhas:**
- **navbar-expand-lg**: Escolhido para que o menu seja colapsado em tablets e smartphones (< 992px) e expandido em desktops
- **navbar-dark bg-dark**: Combinação para melhor contraste visual com texto branco
- **collapse**: Permite que os links sejam escondidos/mostrados responsivamente

**Evidências:**
- **800px**: Menu colapsado (ícone hambúrguer)
- **1280px**: Menu expandido (todos os links visíveis)

![Header Responsivo](image-1.png)

### 4. Cards de Produto com Variações
**Objetivo:** Galeria 2x2 (mobile) → 3x3 (md+) com 'card', 'card-img-top', 'card-body', 'btn'.

**Classes utilizadas:**
- `col-6 col-md-4` - 2 colunas em mobile (50% cada), 3 colunas em desktop (33% cada)
- `card` - Componente de cartão do Bootstrap
- `card-img-top` - Imagem no topo do cartão
- `card-body` - Corpo do cartão com conteúdo
- `card-title` - Título do produto
- `card-text` - Descrição do produto
- `h-100` - Altura 100% para alinhar cartões
- `align-items-stretch` - Critério de altura alinhada
- `btn btn-primary` - Botão estilizado

**Técnicas aplicadas:**
- **Ratio para padronizar imagens**: `aspect-ratio: 4/3` - Mantém proporção 4:3 em todas as imagens
- **Alturas alinhadas**: `h-100` + `align-items-stretch` - Todos os cards ficam com a mesma altura

**Explicação das escolhas:**
- **col-6 col-md-4**: Permite layout responsivo - 2 colunas em telas pequenas, 3 em médias/grandes
- **aspect-ratio: 4/3**: Padroniza todas as imagens para evitar layouts quebrados
- **h-100**: Garante que todos os cards tenham a mesma altura, independente do conteúdo
- **align-items-stretch**: Faz com que o conteúdo se estique para ocupar toda a altura disponível

**Responsividade:**
- **Mobile (< 768px)**: Galeria 2x2 (2 colunas)
- **Desktop (≥ 768px)**: Galeria 3x3 (3 colunas)

**Evidência:**
![Cards de Produto](image-2.png)

## 🚀 Tecnologias Utilizadas
- **Spring Boot 2.7.3**
- **Bootstrap 5.3.3**
- **Thymeleaf** (Template Engine)
- **HTML5 & CSS3**

## 📱 Responsividade
O projeto é totalmente responsivo, adaptando-se a diferentes tamanhos de tela:
- **Mobile** (< 768px): Layout em coluna única
- **Tablet** (768px - 991px): Menu colapsado, colunas adaptadas
- **Desktop** (≥ 992px): Layout completo com menu expandido

## 🎯 Funcionalidades
- ✅ Layout responsivo em 2 colunas
- ✅ Navbar com colapso automático
- ✅ Campo de pesquisa funcional
- ✅ Links de navegação estruturados
- ✅ Design moderno com Bootstrap

---
**Desenvolvido por:** Cristian Passos  
**Data:** Outubro 2025