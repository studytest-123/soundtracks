// dynamic changing of stars in frontend
document.addEventListener("DOMContentLoaded", function () {

    const blocks = document.querySelectorAll(".rating-block");

    blocks.forEach(block => {

        const radios = block.querySelectorAll("input[type=radio]");

        radios.forEach(radio => {
            radio.addEventListener("change", updateRatings);
        });

    });

});

// calculates and updates the star ratings based on selected radio buttons
function updateRatings() {

    const blocks = document.querySelectorAll(".rating-block");
    let segmentAverages = [];

    // for each rating block, calculate the average of the selected radio buttons and update the segment average display
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

        // for each group of radio buttons, find the checked one and add its value to the values array
        Object.values(groups).forEach(group => {

            const checked = group.find(r => r.checked);

            if (checked) {
                values.push(parseInt(checked.value));
            }

        });

        // if there are any values, calculate the average and update the segment average display
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
