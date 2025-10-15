/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './src/pages/**/*.{js,ts,jsx,tsx,mdx}',
    './src/components/**/*.{js,ts,jsx,tsx,mdx}',
    './src/app/**/*.{js,ts,jsx,tsx,mdx}', // Add paths to your pages, components, and app folder
  ],
  theme: {
    extend: {
      colors: {
        background: 'var(--background)', // Example of extending colors
        foreground: 'var(--foreground)', // Example of extending colors
      },
    },
  },
  plugins: [],
};
