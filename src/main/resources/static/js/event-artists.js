function addArtist() {

    const select = document.getElementById("artistSelect");
    const artistId = select.value;
    const artistName = select.options[select.selectedIndex].text;

    if (!artistId) return;

    const list = document.getElementById("artistList");

    const item = document.createElement("li");
    item.className = "list-group-item d-flex justify-content-between";

    item.innerHTML =
        artistName +
        '<button type="button" class="btn btn-sm btn-danger" onclick="removeArtist(this)">Remove</button>';

    list.appendChild(item);

    const hiddenContainer = document.getElementById("artistHiddenInputs");

    const input = document.createElement("input");
    input.type = "hidden";
    input.name = "artistIds";
    input.value = artistId;

    hiddenContainer.appendChild(input);

}

function removeArtist(button) {

    const li = button.parentElement;
    li.remove();

}
