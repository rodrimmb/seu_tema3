# Sistemas Ubicuos
Ejercicios tema 4 de prácticas de Sistemas Ubicuos (Interfaz de Usuario Android)
## Ejercicio 1
Crea la primera vista con un título (``` TextView ```), una caja de texto (``` EditText ```) y dos botones (``` Button ```).

Accede al elemento de tipo ``` TextView ``` y cambia el texto de este en el método ```onCreate() ``` de la ``` Activity ``` principal.

Usa los dos métodos que hemos aprendidos para acceder a los elementos (android nativo y Butter Knife).
## Ejercicio 2
Modifica los tamaños de los elementos del ejercicio anterior usando ``` match_parent ``` y ``` wrap_content ``` para que veas cómo afecta el uso de estas medidas relativas a los elementos de la UI.

Haz que el cuadro de texto (``` EditText ```) ocupe todo el ancho de la pantalla.
<p align="center">
<img 
src="https://raw.githubusercontent.com/rodrimmbdev/seu_t4/master/imgs/exercise_2.png"
alt="Imagen ejercicio 3"
height="200"
/>
</p>

## Ejercicio 3
Usa los layouts que hemos explicado (linera y relative layouts) y todo lo aprendido hasta ahora para que los elementos gráficos del ejercicio 1 se distribuyan como en la siguiente imagen.
<p align="center">
<img 
src="https://raw.githubusercontent.com/rodrimmbdev/seu_t4/master/imgs/exercise_3.png"
alt="Imagen ejercicio 3"
height="300"
/>
</p>

## Ejercicio 4
Haz que al pulsar el botón de la izquierda se abra una nueva ``` Activity ``` que solo contenga un texto. Y cuando se pulse el botón de la derecha se muestre un toast y se borre el texto del input si es que lo hay.

Haz pruebas con los diferentes modos de implementar un Listener:
* Usando una clase externa
* Con una inner class
* Creando una clase anónima
* Que la propia ``` Activity ``` impleménte ``` View.OnClickListener ```.

## Ejercicio 5
Crea una lista simple usando una ``` ListView ``` en la activity ``` SecondActivity ```. Usa el código de ejemplo proporcionado para crear una lista con cuatro elementos de tipo ``` String```, utiliza la clase ```ArrayAdapter```para dibujar la lista.

``` java
<ListView
   android:id="@+id/elements_list"
   android:layout_width="match_parent"
   android:layout_height="match_parent"/>


@BindView(R.id.elements_list) ListView listView;
...
ButterKnife.bind(this);
String[] elements = {"Elemento 1","Elemento 2","Elemento 3","Elemento 4"};
listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, elements));
``` 


