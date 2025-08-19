const nCharacters = 8;
let container = document.getElementById("container");

for (let i = 0; i < nCharacters; i++) {
  container.innerHTML += `
  <div class="card">
        <div class="imagen"><img id="image${i}" /></div>
        <div class="perso" id="name${i}"></div>
        <div class="descripcion" id="description${i}"></div>
      </div>
  `;
}

let rickURL = "https://rickandmortyapi.com/api/character";

fetch(rickURL)
  .then((respuesta) => respuesta.json()) // convierte a JSON real la info recibida HTTP
  .then((data) => {
    for (let i = 0; i < nCharacters; i++) {
      const image = document.getElementById("image" + i);
      const name = document.getElementById("name" + i);
      const description = document.getElementById("description" + i);

      name.innerHTML = data.results[i].name;
      description.innerHTML =
        "Specie: " +
        data.results[i].species +
        "<br> Locattion: " +
        data.results[i].location.name;
      image.src = data.results[i].image;
    }
  });

