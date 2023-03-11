$(document).ready(function() {
});
var btntotal =document.getElementById('btnTotal');



async function agregarProductoLista(id){

      //peticion al servidor
      const request = await fetch('api/getId/' + id, {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const res = await request.json();
      console.log(res);
}

async function eliminarProductoLista(id){
      //peticion al servidor
      const request = await fetch('api/deleteProductList/' + id, {
        method: 'DELETE',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });



      const request2 = await fetch('api/substrac/'  + id, {
              method: 'GET',
              headers:{
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
              }

      });
      const res2 = await request2.json();
      console.log(res2);

}

async function obtenerLista(){

      //peticion al servidor
      const request = await fetch('api/getList' , {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const productos = await request.json();

      console.log('lista de productos a mostrar en modal carrito');
      console.log(productos);


      let listadoHtml = '';

             for (let producto of productos) {
                let cantidad = 0;
                let botonEliminar = '<a href="#" onclick="eliminarProductoLista(' +producto.prdId + ')"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
                let botonAdd = '<a href="#"  id="btnSumar"  onclick="agregarProductoLista(' +producto.prdId + ')" class="btn btn-success btn-circle btn-sm"><i class="fas fa-plus"></i></a>';

                let numero= '<input type="number" id="txtCantidad" name="cantidad" min="10" max="100">'
                let usuarioHtml = '<tr> <td> <img src="'+ producto.prdImagen +'" width="100" height="120"> </td> <td>' + producto.prdNombre + '</td> <td> <p>$'+producto.prdPrecio+'</p>'
                                + '</td>    </tr>';
                listadoHtml += usuarioHtml;
             }

            document.querySelector('#muestraCarrito #tblMuestra').innerHTML = listadoHtml;
            document.querySelector('#exampleModalCenter2 #lblTotalOr').innerHTML = '0';

}

async function vaciarLista(){
      //peticion al servidor
      const request = await fetch('api/clearList' , {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

  const productos = await request.json();

      console.log('lista vacia');
      console.log(productos);


      let listadoHtml = '';

             for (let producto of productos) {
                let cantidad = 0;
                let botonEliminar = '<a href="#" onclick="eliminarProductoLista(' +producto.prdId + ')"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
                let botonAdd = '<a href="#"  id="btnSumar"  onclick="agregarProductoLista(' +producto.prdId + ')" class="btn btn-success btn-circle btn-sm"><i class="fas fa-plus"></i></a>';

                let numero= '<input type="number" id="txtCantidad" name="cantidad" min="10" max="100">'
                let usuarioHtml = '<tr> <td> <img src="'+ producto.prdImagen +'" width="100" height="120"> </td> <td>' + producto.prdNombre + '</td> <td> <p>$'+producto.prdPrecio+'</p>'
                                + '</td>    /tr>';
                listadoHtml += usuarioHtml;
             }

            document.querySelector('#muestraCarrito #tblMuestra').innerHTML = listadoHtml;
            document.querySelector('#exampleModalCenter2 #lblTotalOr').innerHTML = '0';
}

async function obtenerTotal(){
      //peticion al servidor
      const request = await fetch('api/total' , {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const res = await request.json();
      console.log(res);

      document.querySelector('#exampleModalCenter2 #lblTotalOr').innerHTML = res;
}

function getHeaders(){
    return {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': localStorage.token
    }
}