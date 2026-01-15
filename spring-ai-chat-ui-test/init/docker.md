## chroma
```shell
docker run -d --name chroma -p 8000:8000 ghcr.io/chroma-core/chroma:1.0.0
```

```shell
pip install uv
npm install -g npx
```

```json
{
  "mcpServers": {
    "time": {
      "command": "uvx",
      "args": [
        "mcp-server-time",
        "--local-timezone=America/New_York"
      ]
    }
  }
}
```

```json
{
  "mcpServers": {
    "playwright": {
      "command": "npx",
      "args": [
        "@playwright/mcp@latest"
      ]
    }
  }
}
```
