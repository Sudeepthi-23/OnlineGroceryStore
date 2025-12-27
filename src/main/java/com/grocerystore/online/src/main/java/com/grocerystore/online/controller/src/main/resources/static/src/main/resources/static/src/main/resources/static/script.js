function loadProducts() {
    fetch('/products')
        .then(response => response.json())
        .then(data => {
            let list = document.getElementById("productList");
            list.innerHTML = "";
            data.forEach(item => {
                let li = document.createElement("li");
                li.textContent = item;
                list.appendChild(li);
            });
        });
}
