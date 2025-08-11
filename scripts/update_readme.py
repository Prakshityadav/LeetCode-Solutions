import os
from tabulate import tabulate
import re

README_FILE = "README.md"

java_files = [f for f in os.listdir('.') if f.endswith(".java")]


rows = []
day = 1
for file in sorted(java_files):
    match = re.match(r"(\d+)_([A-Za-z0-9_]+)\.java", file)
    if match:
        number = match.group(1)
        name = match.group(2).replace("_", " ")
        rows.append([day, number, name, f"[View Code](./{file})"])
        day += 1


table_md = tabulate(rows, headers=["Day", "Problem #", "Problem Name", "Solution Link"], tablefmt="github")

# Read existing README
with open(README_FILE, "r", encoding="utf-8") as f:
    readme = f.read()

start_marker = "## 🔥 My Progress"
if start_marker in readme:
    parts = readme.split(start_marker)
    new_readme = parts[0] + start_marker + "\n\n" + table_md + "\n"
else:
    new_readme = readme + "\n\n" + start_marker + "\n\n" + table_md + "\n"


with open(README_FILE, "w", encoding="utf-8") as f:
    f.write(new_readme)

print("✅ README updated!")
