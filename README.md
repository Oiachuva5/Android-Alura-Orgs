# Projeto Android-Alura

## Introdução

O projeto criado foi baseado no curso do Alura (Android com Kotlin: criando um app), no qual propôs criar um app onde na tela inicial haveria uma lista que mostrariam um produto com os atributos nome, descrição e valor. No canto inferior direito apresentaria um floatingActionButton para você adicionar um produto a essa lista. O projeto utiliza uma lista para adicionar esses produtos e não um banco de dados local.

### O que eu aprendi?

Durante o caminhar do curso e o desenvolvimento do projeto, o ciclo de vida de uma activity mostrou ser bem mais complexa e detalhada do que imaginava ser. Mostrando na pratica que durante o desenvolvimento, mesmo adicionando um produto na lista na tela de forms você conseguia ver como realmente ela funcionava, pois ela não atualizava na tela, mostrando que ela estava seguindo o seu ciclo (onPause() e retornava no onResume() sem recarregar a tela).
