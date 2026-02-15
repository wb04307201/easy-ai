## redis-stack
```shell
docker run -d --name redis-stack -p 9379:6379 -e REDIS_ARGS="--requirepass 123456" redis/redis-stack:latest
```

## Qdrant
```shell
docker run -d --name qdrant -p 6333:6333 -p 6334:6334 qdrant/qdrant:latest
```
`http://localhost:6333/dashboard`

```shell
pip install uv
npm install -g npx
where uv
where npx
```

## 时间
```json
{
  "mcpServers": {
    "time": {
      "command": "uvx",
      "args": [
        "mcp-server-time",
        "--local-timezone=Asia/Shanghai"
      ]
    }
  }
}
```

```shell
npx @modelcontextprotocol/inspector uvx mcp-server-time
```

## 操作浏览器
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

## Fetch网页内容抓取
```json
{
  "mcpServers": {
    "fetch": {
      "args": [
        "mcp-server-fetch"
      ],
      "command": "uvx"
    }
  }
}
```

```shell
npx @modelcontextprotocol/inspector uvx mcp-server-fetch
```
