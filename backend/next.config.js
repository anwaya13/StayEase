/** @type {import('next').NextConfig} */
const nextConfig = {
    eslint: {
        ignoreDuringBuilds: true, // Disable ESLint errors blocking build
    },
    images: {
        domains: ["images.pexels.com"], // Allow external image domains
    },
};

export default nextConfig;
