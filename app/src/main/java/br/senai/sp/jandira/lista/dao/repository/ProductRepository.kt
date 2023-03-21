package br.senai.sp.jandira.lista.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.senai.sp.jandira.lista.R
import br.senai.sp.jandira.lista.model.Product

class ProductRepository {
   companion object {
       @Composable
       fun getProductList(): List<Product> {
           return listOf<Product>(
               Product(
                   id = 1,
                   name = "Mouse",
                   price = 29.99,
                   description = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                   image = painterResource(id = R.drawable.teclado)
               ),
               Product(
                   id = 2,
                   name = "Teclado",
                   price = 29.99
                   ,
                   description = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",

               ),
               Product(
                   id = 3,
                   name = "MiCkey Mouse",
                   price = 29.99,
                   description = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                   image = painterResource(id = R.drawable.teclado)
               ),
               Product(
                   id = 4,
                   name = "caneca",
                   price = 29.99,
                   description = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",

               ),
               Product(
                   id = 5,
                   name = "Camisa JavaScript",
                   price = 29.9,
                   description = "is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                   image = painterResource(id = R.drawable.teclado)
               )
           )

       }

   }}