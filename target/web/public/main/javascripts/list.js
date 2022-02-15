const input = document.querySelector("#input");
const form = document.querySelector('form')
const btn = document.querySelector("#btn");
const result = document.querySelector("#result");
const total = document.querySelector(".total-count");
let totalCount = 0;

(function () {
    const items = getItemsFromLocalStorage();
    items.forEach(str => createElement(str))
})();

function getItemsFromLocalStorage() {
    if(localStorage.getItem('items')) {
        return JSON.parse(localStorage.getItem('items'));
    }
    return [];
}

input.addEventListener('input', () => {
    btn.disabled = input.value === '';
});

form.addEventListener('submit', (e) => {
    e.preventDefault();
    if (input.value === "") return;
    createElement(input.value);
    const newItems = getItemsFromLocalStorage();
    newItems.push(input.value);
    input.value = '';
    localStorage.setItem('items', JSON.stringify(newItems))
    input.value = "";
})

function createElement(value) {
    totalCount++;

    const temp = document.querySelector('#item_template')
    const tempLi = temp.content.querySelector("li");

    const li = document.importNode(tempLi, true);
    const del = li.querySelector(".btn");
    li.querySelector('.text').textContent = value;

    del.addEventListener("click", (e) => {
        result.removeChild(li);
        totalCount--;
        total.innerText = totalCount;
        const localItems = getItemsFromLocalStorage();
        const newItems = localItems.filter((item) => item !== li.textContent.substring(0, li.textContent.length - 6));
        localStorage.setItem('items', JSON.stringify(newItems));
    })

    total.textContent = String(totalCount);
    result.appendChild(li)
}