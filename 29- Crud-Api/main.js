//Ver cual es la URL de la raíz
// Esta será para usuarios

const parrafoName = document.getElementById("name"); //pilla elemento HTML parrafo con id 'name'
const parrafoUserName = document.getElementById("username"); //pilla elemento HTML parrafo con id 'username'
const parrafoEmail = document.getElementById("email"); //pilla elemento HTML parrafo con id 'email'
let id = document.getElementById("id"); // ID a buscar introducido por input
let idAModificar = document.getElementById("idAModificar"); //ID a modificar introducido en un input
let idAEliminar = document.getElementById("idAEliminar"); //ID a modificar introducido en un input
let res1 = document.getElementById("res1"); //Div en donde se mostrará "Ver Todos"
let res2 = document.getElementById("res2"); //Div en donde se mostrará "Ver uno"
let res3 = document.getElementById("res3"); //Div en donde se mostrará "Sumar uno"
let res4 = document.getElementById("res4"); //Div en donde se mostrará "Sumar uno"
let res5 = document.getElementById("res5"); //Div en donde se mostrará "Eliminar uno"

// C.R.U.D. (Create, Read, Update, Delete)
const URL = "https://jsonplaceholder.typicode.com/users";

//GET
function verTodos() {
  fetch(URL)
    .then((response) => response.json())
    .then((data) => {
      res1.innerHTML = "(Mirar en la consola)";
      console.log(data);
    })
    .catch((error) => console.log(error));
}

// GET By ID
function verUno() {
  fetch(`${URL}/${id.value}`)
    .then((response) => response.json())
    .then((data) => {
      res2.innerHTML = "El usuario es: <br>" + JSON.stringify(data);
    })
    .catch((error) => console.log(error));
}

// POST: crear uno nuevo al final: pasamos el cuerpo entero (body con todos los clave-valor)
function sumarUno() {
  fetch(URL, {
    method: "POST",
    headers: {
      "Content-type": "aplication/json",
    },
    body: JSON.stringify({
      name: "Carla Marchán",
      username: "cmarchan",
      email: "carla123@gmail.com",
      address: {
        street: "Delicias",
        suite: "Suite 35",
        city: "Zaragoza",
        zipcode: "50011",
        geo: {
          lat: "-21.8128",
          lng: "84.5341",
        },
      },
      phone: "641583696",
      website: "abc.com",
      company: {
        name: "Ironhack Spain",
        catchPhrase: "por qué quieres que trabaje si estoy de vacaciones",
        bs: "ps: vacaciones todo el año",
      },
    }),
  })
    .then((res) => res.json())
    .then((data) => {
      res3.innerHTML = "Usuario agregado exitosamente!";
      console.log(data);
    })
    .catch((error) => console.log(error));
}

// cambiar todo (PUT) - te sobreescribe el id que le digas
function cambiarUno() {
  fetch(`${URL}/${idAModificar.value}`, {
    method: "PUT",
    headers: {
      "Content-type": "application/json",
    },
    body: JSON.stringify({
      name: "Pepito Grillo",
      username: "pgrillo",
      email: "peper@annie.ca",
      address: {
        street: "micalle",
        suite: "Suite 777",
        city: "RoscoCity",
        zipcode: "08080",
        geo: {
          lat: "-31.8128",
          lng: "62.5341",
        },
      },
      phone: "6665555444",
      website: "miweb.com",
      company: {
        name: "Ironhack Spain",
        catchPhrase: "por qué quieres que trabaje si estoy de vacaciones",
        bs: "ps: vacaciones todo el año",
      },
    }),
  })
    .then((res) => res.json())
    .then((data) => {
      res4.innerHTML = "Usuario actualizado exitosamente!";
      console.log(data);
    })
    .catch((error) => console.log(error));
}

// DELETE borrar uno por id
function borrarUnoPorId() {
  fetch(`${URL}/${idAEliminar}`, {
    method: "DELETE",
    headers: {
      "Content-type": "application/json",
    },
  })
    .then((res) => res.json())
    .then((data) => {
      res5.innerHTML="Usuario eliminado con éxito!"
      console.log("registro borrado!!!");
    })
    .catch((error) => console.log(error));
}
