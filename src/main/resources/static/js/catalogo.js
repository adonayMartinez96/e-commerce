async function obtenerCategoria(){
      //peticion al servidor
      const request = await fetch('api/getAllCategorias', {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const clients = await request.json();
      console.log(clients);
}
var btnTotal= document.getElementById('btnTotal');

async function obtenerProductosPorCategoria(id){
        //peticion al servidor
      const request = await fetch('api/getProductCategory/' + id, {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const productos = await request.json();

       let listadoHtml = '';

       for (let producto of productos) {
          let cantidad = 0;
          let botonEliminar = '<a href="#" onclick="eliminarProductoLista(' +producto.prdId + ')"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
          let botonAdd = '<a href="#"  id="btnSumar"  onclick="agregarProductoLista(' +producto.prdId + ')" class="btn btn-success btn-circle btn-sm"><i class="fas fa-plus"></i></a>';

          let usuarioHtml = '<tr> <td> <img src="'+ producto.prdImagen +'" width="100" height="120"> </td> <td>' + producto.prdNombre + '</td> <td> <p>$'+producto.prdPrecio+'</p>'
                          + '</td>  <td id="lblCantidad">'+ 0 + '</td>  <td>' + botonEliminar + ' '+botonAdd+'</td></tr>';
          listadoHtml += usuarioHtml;
       }

      document.querySelector('#entradas #tblEntradas').innerHTML = listadoHtml;
      console.log(productos);
}



async function obtenerProductosPorCategoria(id){
        //peticion al servidor
      const request = await fetch('api/getProductCategory/' + id, {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const productos = await request.json();

       let listadoHtml = '';

       for (let producto of productos) {
          let cantidad = 0;
          let botonEliminar = '<a href="#" onclick="eliminarProductoLista(' +producto.prdId + ')"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
          let botonAdd = '<a href="#"  id="btnSumar"  onclick="agregarProductoLista(' +producto.prdId + ')" class="btn btn-success btn-circle btn-sm"><i class="fas fa-plus"></i></a>';

          let usuarioHtml = '<tr> <td> <img src="'+ producto.prdImagen +'" width="100" height="120"> </td> <td>' + producto.prdNombre + '</td> <td> <p>$'+producto.prdPrecio+'</p>'
                          + '</td>  <td id="lblCantidad">'+ 0 + '</td>  <td>' + botonEliminar + ' '+botonAdd+'</td></tr>';
          listadoHtml += usuarioHtml;
       }

      document.querySelector('#entradas #tblEntradas').innerHTML = listadoHtml;
      console.log(productos);
}

async function obtenerProductosPorCategoria20(id){
        //peticion al servidor
      const request = await fetch('api/getProductCategory/' + id, {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const productos = await request.json();

       let listadoHtml = '';

       for (let producto of productos) {
          let cantidad = 0;
          let botonEliminar = '<a href="#" onclick="eliminarProductoLista(' +producto.prdId + ')"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
          let botonAdd = '<a href="#"  id="btnSumar"  onclick="agregarProductoLista(' +producto.prdId + ')" class="btn btn-success btn-circle btn-sm"><i class="fas fa-plus"></i></a>';

          let usuarioHtml = '<tr> <td> <img src="'+ producto.prdImagen +'" width="100" height="120"> </td> <td>' + producto.prdNombre + '</td> <td> <p>$'+producto.prdPrecio+'</p>'
                          + '</td>  <td id="lblCantidad">'+ 0 + '</td>  <td>' + botonEliminar + ' '+botonAdd+'</td></tr>';
          listadoHtml += usuarioHtml;
       }

      document.querySelector('#bebidas #tblBebidas').innerHTML = listadoHtml;
      console.log(productos);
}

async function obtenerProductosPorCategoria30(id){
        //peticion al servidor
      const request = await fetch('api/getProductCategory/' + id, {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const productos = await request.json();

       let listadoHtml = '';

       for (let producto of productos) {
          let cantidad = 0;
          let botonEliminar = '<a href="#" onclick="eliminarProductoLista(' +producto.prdId + ')"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
          let botonAdd = '<a href="#"  id="btnSumar"  onclick="agregarProductoLista(' +producto.prdId + ')" class="btn btn-success btn-circle btn-sm"><i class="fas fa-plus"></i></a>';

          let usuarioHtml = '<tr> <td> <img src="'+ producto.prdImagen +'" width="100" height="120"> </td> <td>' + producto.prdNombre + '</td> <td> <p>$'+producto.prdPrecio+'</p>'
                          + '</td>  <td>' + botonEliminar + ' '+botonAdd+'</td></tr>';
          listadoHtml += usuarioHtml;
       }

      document.querySelector('#platosFuertes #tblPlatos').innerHTML = listadoHtml;
      console.log(productos);
}

async function obtenerProductosPorCategoria40(id){
        //peticion al servidor
      const request = await fetch('api/getProductCategory/' + id, {
        method: 'GET',
        headers:{
              'Accept': 'application/json',
              'Content-Type': 'application/json'
        }
      });

      const productos = await request.json();

       let listadoHtml = '';

       for (let producto of productos) {
          let cantidad = 0;
          let botonEliminar = '<a href="#" onclick="eliminarProductoLista(' +producto.prdId + ')"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
          let botonAdd = '<a href="#"  id="btnSumar"  onclick="agregarProductoLista(' +producto.prdId + ')" class="btn btn-success btn-circle btn-sm"><i class="fas fa-plus"></i></a>';

          let usuarioHtml = '<tr> <td> <img src="'+ producto.prdImagen +'" width="100" height="120"> </td> <td>' + producto.prdNombre + '</td> <td> <p>$'+producto.prdPrecio+'</p>'
                          + '</td>  <td id="lblCantidad">'+ 0 + '</td>  <td>' + botonEliminar + ' '+botonAdd+'</td></tr>';
          listadoHtml += usuarioHtml;
       }

      document.querySelector('#postres #tblPostres').innerHTML = listadoHtml;
      console.log(productos);
}

