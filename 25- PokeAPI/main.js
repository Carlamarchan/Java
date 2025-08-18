let pokemonURL = "https://pokeapi.co/api/v2/pokemon/3";
let pokemonURL2 = "https://pokeapi.co/api/v2/pokemon";
const nombrePokemon = document.getElementById("nombrePokemon");
const imagenPokemon = document.getElementById("imagenPokemon");
const habilidadesPasadas = document.getElementById("pastAbilities")

//Fetch conecta con la URL y concatena metodos (then y catch)
fetch(pokemonURL)
  .then((respuesta) => respuesta.json()) // convierte a JSON real la info recibida HTTP
  .then((data) => {
    //Otra función anónima y aquí ya puedes ejecutar el código al llamar a otras funciones
    console.log("todo: ", data);
    console.log("moves: ", data.moves);
    console.log("moves, el primero: ", data.moves[0]);
    console.log(
      "moves, el primero, solo valor de 'move': ",
      data.moves[0].move
    );
    console.log(
      "moves, el primero, valor de 'move' y valor de nombre: ",
      data.moves[0].move.name
    );
    console.log("Ver la ruta de front female", data.sprites.front_female);
    console.log("Cómo llegar a chlorophyl", data.abilities[1].ability.name);

    //Mostrar en pantalla
    //Dentro del párrafo vacío irá el nombre
    nombrePokemon.innerHTML = data.name;

    //En la imagen asignamos el source (scr) de la imagen que queremos
    imagenPokemon.src = data.sprites.front_female;
    habilidadesPasadas.innerHTML=JSON.stringify(data.past_abilities[0].abilities[0]);
  })
  .catch((error) => console.log(error));

/*fetch(pokemonURL2)
.then((respuesta)=>respuesta.json()) // convierte a JSON real la info recibida HTTP
.then((data) =>{
    console.log("Desde URL general de Pokemon: ", data.results[3].name)
})
.catch((error)=> console.log(error))*/
