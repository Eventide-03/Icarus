# Icarus

Icarus is the official website for M.A.A.D Bots, a startup robotics team dedicated to advancing STEM education and robotics in the Southern California community. Built using [Kobweb](https://github.com/varabyte/kobweb), this site serves as a hub for sharing our mission, showcasing our projects, and connecting with sponsors, mentors, and supporters.

## About M.A.A.D Bots

M.A.A.D Bots is a startup robotics team beginning to branch out and influence the Southern California robotics community. Our members are experienced, and have participated in the FRC and FTC robotics competitions. A sponsorship from your company would greatly benefit our cause. Any form of sponsorship, whether of experienced mentors, monetary contributions, or donation of materials alleviates burdens for our team and funds active participation in the community. With your support, our members grow as engineers and leaders, while we expand the local STEM community.

## Features

- Built with Kobweb
- Live reload for fast development cycles
- Ready for deployment to static or dynamic hosting providers

## Getting Started

### Prerequisites

- [Kobweb CLI](https://github.com/varabyte/kobweb)
- [Java JDK 17+](https://adoptium.net/)
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/) (recommended)

### Installation

1. Clone the repository:
    ```bash
    git clone <your-repo-url>
    cd icarus
    ```

2. Navigate to the `site` directory and start the development server:
    ```bash
    cd site
    kobweb run
    ```

3. Open [http://localhost:8080](http://localhost:8080) in your browser to view the app.

4. Press `Q` in the terminal to gracefully stop the server.

### Development

- Edit, add, or remove components, pages, and API endpoints as needed.
- The site will automatically reload when changes are detected.

### Building for Production

To export the project for production:

```bash
kobweb export
```

To run in production mode:

```bash
kobweb run --env prod
```

For cloud deployments, use:

```bash
kobweb run --env prod --notty
```

Kobweb supports static export for hosting on platforms like GitHub Pages, Netlify, and Firebase. [Learn more](https://bitspittle.dev/blog/2022/staticdeploy).

## Credits

- **OmyDaGreat** – Provided the core library for building this website with Kobweb.
- **Muntasir Billah** – Created the [Figma template](https://www.figma.com/community/file/1222060007934600841) used as a design reference.

## License

[MIT](LICENSE) (or specify your license here)

---
Thank you to OmyDaGreat for providing me with this amazing library for the building of this website through kobweb, and Muntasir Billah for creating a general template on Figma for our reference! <br>
Figma Template: <br> https://www.figma.com/community/file/1222060007934600841