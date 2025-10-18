public class NoFila {
        private ElementoFila elemento;
        private NoFila proximo;

        public NoFila (ElementoFila elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }

        public ElementoFila getElemento() {
            return elemento;
        }

        public void setElemento(ElementoFila elemento) {
            this.elemento = elemento;
        }

        public NoFila getProximo() {
            return proximo;
        }

        public void setProximo(NoFila proximo) {
            this.proximo = proximo;
        }
}
