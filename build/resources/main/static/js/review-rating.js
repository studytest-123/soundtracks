document.addEventListener("DOMContentLoaded", function () {

    const blocks = document.querySelectorAll(".rating-block");

    blocks.forEach(block => {

        const radios = block.querySelectorAll("input[type=radio]");

        radios.forEach(radio => {
            radio.addEventListener("change", updateRatings);
        });

    });

});

function updateRatings() {

    const blocks = document.querySelectorAll(".rating-block");
    let segmentAverages = [];

    blocks.forEach(block => {

        const radios = block.querySelectorAll("input[type=radio]");
        const groups = {};
        const values = [];

        radios.forEach(r => {

            if (!groups[r.name]) {
                groups[r.name] = [];
            }

            groups[r.name].push(r);

        });

        Object.values(groups).forEach(group => {

            const checked = group.find(r => r.checked);

            if (checked) {
                values.push(parseInt(checked.value));
            }

        });

        if (values.length > 0) {

            const avg = values.reduce((a,b) => a+b,0) / values.length;

            segmentAverages.push(avg);

            const stars = Math.round(avg);

            const starString =
                "★★★★★".slice(0, stars) +
                "☆☆☆☆☆".slice(0, 5 - stars);

            const segmentDisplay = block.querySelector(".segment-average");

            if (segmentDisplay) {
                segmentDisplay.textContent = starString;
            }

        }

    });

    if (segmentAverages.length === 0) return;

    const overall =
        segmentAverages.reduce((a,b) => a+b,0) /
        segmentAverages.length;

    const stars = Math.round(overall);

    const starString =
        "★★★★★".slice(0, stars) +
        "☆☆☆☆☆".slice(0, 5 - stars);

    const overallDisplay = document.getElementById("overall-stars");

    if (overallDisplay) {
        overallDisplay.textContent = starString;
    }

}
