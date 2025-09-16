/**
 * Representa un Animal genérico.
 * @class
 */
class Animal {
  /**
   * Crea un animal.
   * @param {string} nombre - El nombre del animal.
   * @param {string} especie - La especie del animal.
   */
  constructor(nombre, especie) {
    this.nombre = nombre;
    this.especie = especie;
  }

  /**
   * Hace que el animal emita un sonido genérico.
   * @returns {string} Un sonido de animal.
   */
  hacerSonido() {
    return "Sonido genérico";
  }
}

/**
 * Representa un Perro.
 * @extends Animal
 */
class Perro extends Animal {
  /**
   * Crea un perro.
   * @param {string} nombre - Nombre del perro.
   * @param {string} raza - Raza del perro.
   */
  constructor(nombre, raza) {
    super(nombre, "Perro");
    this.raza = raza;
  }

  /**
   * El perro ladra.
   * @returns {string} El sonido de un perro.
   */
  hacerSonido() {
    return "¡Guau guau!";
  }
}

/**
 * Representa un Gato.
 * @extends Animal
 */
class Gato extends Animal {
  /**
   * Crea un gato.
   * @param {string} nombre - Nombre del gato.
   * @param {string} color - Color del gato.
   */
  constructor(nombre, color) {
    super(nombre, "Gato");
    this.color = color;
  }

  /**
   * El gato maúlla.
   * @returns {string} El sonido de un gato.
   */
  hacerSonido() {
    return "Miau";
  }
}

// Ejemplos de uso documentados
const perro = new Perro("Firulais", "Labrador");
const gato = new Gato("Misu", "Negro");

console.log(perro.hacerSonido()); // ¡Guau guau!
console.log(gato.hacerSonido());  // Miau
