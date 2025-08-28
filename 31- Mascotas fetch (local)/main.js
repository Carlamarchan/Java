const botonEnviar = document.getElementById("enviar"); //Buscar mascota por ID
const inputIdMascota = document.getElementById("petId"); //Input ID mascota

const url = "http://localhost:8080/gatos";

const card = document.getElementById("card");
const image = document.getElementById("image");
const nombre = document.getElementById("name");
const age = document.getElementById("age");

// //Leer uno por ID
// const formulario = document.getElementById("formulario");

formulario.addEventListener("submit", function (event) {
  event.preventDefault();
  //
  //   console.log(inputIdMascota.value);
  mostrarMascota();
});
function mostrarMascota() {
  let id = inputIdMascota.value;
  fetch(`${url}/${id}`, {
    method: "GET",
    headers: {
      "Content-type": "application/json",
    },
  })
    .then((res) => res.json())
    .then((gato) => {
      card.style.display = "block";
      image.src = `images/${gato.image}`;
      nombre.innerText = "Nombre: " + gato.name;
      age.innerText = "Edad: " + gato.age;
    })
    .catch((error) => console.log("Error al leer usuario", error));
}
//
//   fetch("http://localhost:8080/gatos/3", {
//     method: "GET",
//     headers: {
//       "Content-type": "application/json",
//     },
//   })
//     .then((res) => res.json())
//     .then((gato) => {
//       console.log(gato.name, gato.age, gato.image);
//       card.style.display = "block";
//       image.src = gato.image;
//       nombre.innerText = gato.name;
//       age.innerText = gato.age;
//     })
//     .catch((error) => console.log("Error al leer usuario", error));
