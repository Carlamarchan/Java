const botonMostrarUsuario = document.getElementById("enviar");
botonMostrarUsuario.addEventListener("click", mostrarUser);

const inputUserId = document.getElementById("userid"); //pilla todo el input
const url = "https://reqres.in/api/users";
const apiKey = "reqres-free-v1";

const card = document.getElementById("card");
const imagen = document.getElementById("imagenperfil");
const nombre = document.getElementById("nombre");
const apellido = document.getElementById("apellido");
const botonAddUser = document.getElementById("addUser");
//botonAddUser.addEventListener("click", agregarUsuario);

//Leer uno por ID
const formulario1 = document.getElementById("formulario1");
 formulario1.addEventListener("submit", function (event) {
  event.preventDefault();
  mostrarUser();
});
function mostrarUser() {
  //Aquí es donde debe¡ pillar el value del input
  let id = inputUserId.value;
  console.log("user id: ", id);

  fetch(`${url}/${id}`, {
    method: "GET",
    headers: {
      "Contect-type": "application/json",
      "x-api-key": apiKey,
    },
  })
    .then((res) => res.json())
    .then((usuario) => {
      console.log(
        usuario.data.first_name,
        usuario.data.last_name,
        usuario.data.avatar
      );
      card.style.display = "block";
      imagen.src = usuario.data.avatar;
      nombre.innerText = usuario.data.first_name;
      apellido.innerText = usuario.data.last_name;
    })
    .catch((error) => console.log("Error al leer usuario", error));
}

// //ADD new user  (usando la URL/users)
// const formulario = document.getElementById("formulario2");
// formulario.addEventListener("submit", function (event) {
//   event.preventDefault();
//   const nombre = document.getElementById("nuevoNombre").value;
//   const apellido = document.getElementById("nuevoApellido").value;
//   const email = document.getElementById("nuevoEmail").value;
//   agregarUsuario(nombre, apellido, email);
// });

// function agregarUsuario(nombre, apellido, email) {
//   fetch(url, {
//     method: "POST",
//     headers: {
//       "Content-type": "application/json",
//       "x-api-key": apiKey,
//     },
//     body: JSON.stringify({
//       "id": 13,
//       first_name: nombre,
//       last_name: apellido,
//       email: email,
//     }),
//   })
//     .then((res) => res.json())
//     .then((usuario) => {
//       console.log(usuario);
//       card.style.display = "block";
//       //   imagen.src = usuario.data.avatar;
//       // nombre.innerText = usuario.data.first_name;
//       //apellido.innerText = usuario.data.last_name;
//     })
//     .catch((error) => console.log("Error al añadir usuario", error));
// }

//ADD new user (Usando la URL/register)
const formulario = document.getElementById("formulario2");
const url2 = "https://reqres.in/api/register";
formulario.addEventListener("submit", function (event) {
  event.preventDefault();
  const nombre = document.getElementById("nuevoNombre").value;
  const apellido = document.getElementById("nuevoApellido").value;
  const email = document.getElementById("nuevoEmail").value;
  agregarUsuario(nombre, apellido, email);
});

function agregarUsuario(nombre, apellido, email) {
  fetch(url, {
    method: "POST",
    headers: {
      "Content-type": "application/json",
      "x-api-key": apiKey,
    },
    body: JSON.stringify({
      email: email,
      first_name: nombre,
      id: 13,
      last_name: apellido,
    }),
  })
    .then((res) => res.json())
    .then((usuario) => {
      console.log(usuario);
      card.style.display = "block";
    })
    .catch((error) => console.log("Error al añadir usuario", error));
}


//PUT user-update
function updateUser(){

}