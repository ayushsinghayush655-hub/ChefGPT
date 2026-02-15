# ChefGPT
"A multimodal AI web app built with Next.js 14 and Google Gemini that generates custom Indian recipes from ingredient photos. Features a mobile-first 'Desi' UI, Supabase backend, and constraint-based cooking logic for students."


# PROJECT CONTEXT: JugaadChef
We are building a Next.js 14 (App Router) web app for Indian students.

## 1. TECH STACK (STRICT)
- Framework: Next.js 14 (App Router)
- Language: JavaScript (ES6+)
- Styling: Tailwind CSS
- Icons: lucide-react
- Database: Supabase
- AI: Google Gemini API (JSON output only)

## 2. VISUAL DESIGN SYSTEM
- **Font:** Inter (Google Fonts)
- **Primary Color (Spice Red):** #E63946 (Buttons, Highlights)
- **Background (Roti Beige):** #FFF8E1 (Main App Background)
- **Surface (White):** #FFFFFF (Cards, Modals)
- **Text (Charcoal):** #1F2937
- **Radius:** rounded-3xl (Big, friendly curves)
- **Shadows:** shadow-xl (Soft, deep depth)

## 3. CODING RULES
- Use `const` and Arrow Functions `() => {}`.
- Use `lucide-react` for icons (e.g., `<Camera />`).
- Do NOT use standard CSS files; use Tailwind classes only.
- All API routes must return JSON, never plain text.

## 4. DATA SCHEMA (The Contract)
The Recipe Object must always look like this:
{
  "id": "uuid",
  "title": "String",
  "ingredients": ["String", "String"],
  "steps": ["String", "String"],
  "nutrition": { "calories": "Number", "protein": "String" },
  "tags": ["Vegetarian", "Spicy"]
}
