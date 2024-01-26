.class public Ln0/b$b;
.super Lm0/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final c:Lm0/i;


# instance fields
.field public b:Ll/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/i<",
            "Ln0/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln0/b$b$a;

    invoke-direct {v0}, Ln0/b$b$a;-><init>()V

    sput-object v0, Ln0/b$b;->c:Lm0/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lm0/h;-><init>()V

    new-instance v0, Ll/i;

    const/16 v1, 0xa

    .line 1
    invoke-direct {v0, v1}, Ll/i;-><init>(I)V

    .line 2
    iput-object v0, p0, Ln0/b$b;->b:Ll/i;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Ln0/b$b;->b:Ll/i;

    invoke-virtual {v0}, Ll/i;->i()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-gtz v0, :cond_1

    iget-object v0, p0, Ln0/b$b;->b:Ll/i;

    .line 1
    iget v3, v0, Ll/i;->d:I

    iget-object v4, v0, Ll/i;->c:[Ljava/lang/Object;

    move v5, v2

    :goto_0
    if-ge v5, v3, :cond_0

    aput-object v1, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iput v2, v0, Ll/i;->d:I

    iput-boolean v2, v0, Ll/i;->a:Z

    return-void

    .line 2
    :cond_1
    iget-object v0, p0, Ln0/b$b;->b:Ll/i;

    invoke-virtual {v0, v2}, Ll/i;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/b$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    throw v1
.end method
